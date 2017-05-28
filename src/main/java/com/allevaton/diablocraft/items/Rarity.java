package com.allevaton.diablocraft.items;

import com.allevaton.diablocraft.rng.RNG;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class Rarity {
  private Rarities _rarity;

  public Rarity(ItemStack stack, EntityPlayer player) {
    this._rarity = RNG.generateRarity(player);
    stack.getTagCompound().setInteger("DC_RARITY", this._rarity.getInt());
  }
}