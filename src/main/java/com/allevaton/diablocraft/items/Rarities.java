package com.allevaton.diablocraft.items;

import net.minecraft.nbt.NBTTagInt;

public enum Rarities {
  COMMON(1, 1000), 
  UNCOMMON(2, 750), 
  RARE(3, 325), 
  EPIC(4, 133),
  LEGENDARY(5, 2);

  // Total: 2210

  private int _rarity;
  private int _weight;

  Rarities(int rarity, int weight) {
    this._rarity = rarity;
    this._weight = weight;
  }

  public int getInt() {
    return this._rarity;
  }

  public int getWeight() {
    return this._weight;
  }

  public static Rarities fromId(int id) {
    switch (id) {
      case 1: return Rarities.COMMON;
      case 2: return Rarities.UNCOMMON;
      case 3: return Rarities.RARE;
      case 4: return Rarities.EPIC;
      case 5: return Rarities.LEGENDARY;
      default: return Rarities.COMMON;
    }
  }

  public NBTTagInt toTag() {
    return new NBTTagInt(_rarity);
  }
}
