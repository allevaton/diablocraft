package com.allevaton.diablocraft.rng;

import java.util.ArrayList;
import java.util.List;

import com.allevaton.diablocraft.items.Rarities;

import net.minecraft.entity.player.EntityPlayer;

public class RNG {
  public static Rarities generateRarity(EntityPlayer player) {
    int r = (int) (Math.random() * RNG._raritiesLength) - 1;
    int found = RNG._rarityArray.get(r);
    return Rarities.fromId(found);
  }

  private static int _raritiesLength;
  private static List<Integer> _rarityArray = new ArrayList<Integer>();

  public static void setupRarities() {
    // Add up all the rarities by their weight to create an array to get weighted randoms
    Rarities[] values = Rarities.values();

    for (Rarities value : values) {
      int weightCount = value.getWeight();

      for (int j = 0; j < weightCount; j++) {
        RNG._rarityArray.add(value.getInt());
      }
    }

    // Cache the length
    RNG._raritiesLength = RNG._rarityArray.size();
  }
}