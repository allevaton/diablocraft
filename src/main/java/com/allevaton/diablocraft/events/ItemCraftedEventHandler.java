package com.allevaton.diablocraft.events;

import com.allevaton.diablocraft.items.Weapon;
import com.allevaton.diablocraft.utils.Utils;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagString;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;

public class ItemCraftedEventHandler {

  @SubscribeEvent
  public void onItemCrafted(ItemCraftedEvent event) {
    ItemStack stack = event.crafting;

    if (stack.getItem() instanceof ItemSword) {
      Utils.checkTagCompound(stack);
      Weapon.createWeapon(stack, event.player);
      System.out.println(stack.getTagCompound().getInteger("DC_RARITY"));
    }
  }
}