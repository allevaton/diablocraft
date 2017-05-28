package com.allevaton.diablocraft.utils;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class Utils {
  public static void checkTagCompound(ItemStack stack) {
    if (stack.getTagCompound() == null) {
      stack.setTagCompound(new NBTTagCompound());
    }
  }
}