package com.softserve.homeproject.service.datajpa;


import com.softserve.homeproject.UserTestData;
import com.softserve.homeproject.model.Meal;
import com.softserve.homeproject.service.AbstractMealServiceTest;
import com.softserve.homeproject.util.exception.NotFoundException;
import org.junit.Test;
import org.springframework.test.context.ActiveProfiles;

import static com.softserve.homeproject.MealTestData.*;
import static com.softserve.homeproject.Profiles.DATAJPA;
import static com.softserve.homeproject.UserTestData.ADMIN_ID;
import static org.junit.jupiter.api.Assertions.assertThrows;


@ActiveProfiles(DATAJPA)
class DataJpaMealServiceTest extends AbstractMealServiceTest {
    @Test
    void getWithUser() throws Exception {
        Meal adminMeal = service.getWithUser(ADMIN_MEAL_ID, ADMIN_ID);
        assertMatch(adminMeal, ADMIN_MEAL1);
        UserTestData.assertMatch(adminMeal.getUser(), UserTestData.ADMIN);
    }

    @Test
    void getWithUserNotFound() throws Exception {
        assertThrows(NotFoundException.class, () ->
                service.getWithUser(MEAL1_ID, ADMIN_ID));
    }
}
