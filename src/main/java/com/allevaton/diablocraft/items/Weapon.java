package com.allevaton.diablocraft.items;

import com.allevaton.diablocraft.items.Rarity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class Weapon {
  public static void createWeapon(ItemStack stack, EntityPlayer player) {
    // Create a rarity
    Rarity rarity = new Rarity(stack, player);
  }
}