package ru.anvarzhonov.clientservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.anvarzhonov.clientservice.entity.ItemEntity;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Integer> {
    List<ItemEntity> findByClientId(Integer clientId);
}
