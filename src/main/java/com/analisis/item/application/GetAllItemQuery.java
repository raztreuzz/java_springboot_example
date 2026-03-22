package com.analisis.item.application;

import com.analisis.item.domain.ItemRepository;
import org.springframework.stereotype.Service;
import com.analisis.item.domain.item;

import java.util.List;

@Service
public class GetAllItemQuery {
    private final ItemRepository itemRepository;

    public GetAllItemQuery(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }


    public List<item> execute() {
        return itemRepository.findAll();
    }
}
