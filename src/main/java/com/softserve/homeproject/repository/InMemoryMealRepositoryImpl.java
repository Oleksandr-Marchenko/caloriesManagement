package com.softserve.homeproject.repository;

import com.softserve.homeproject.model.Meal;
import com.softserve.homeproject.util.MealsUtil;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

//public class InMemoryMealRepositoryImpl implements MealRepository {
//    private Map<Integer, Meal> repository = new ConcurrentHashMap<>();
//    private AtomicInteger counter = new AtomicInteger(0);
//
//    {
//        MealsUtil.MEALS.forEach(this::save);
//    }
//
//    @Override
//    public Meal save(Meal meal) {
//        if (meal.isNew()) {
//            meal.setId(counter.incrementAndGet());
//            repository.put(meal.getId(), meal);
//            return meal;
//        }
//        // treat case: update, but absent in storage
//        return repository.computeIfPresent(meal.getId(), (id, oldMeal) -> meal);
//    }
//
//    @Override
//    public boolean delete(int id) {
//        return repository.remove(id) != null;
//    }
//
//    @Override
//    public Meal get(int id) {
//        return repository.get(id);
//    }
//
//    @Override
//    public Collection<Meal> getAll() {
//        return repository.values();
//    }
//
//    @Override
//    public List<Meal> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId) {
//        return null;
//    }
//
//    @Override
//    public Meal getWithUser(int id, int userId) {
//        return null;
//    }
//}
