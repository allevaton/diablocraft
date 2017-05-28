package com.allevaton.diablocraft.events;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class EventCreateWeapon {

  @SubscribeEvent
  public void onPlayerTick(PlayerTickEvent event) {
    if (!event.player.getEntityWorld().isRemote) {
      if (event.phase == Phase.START) {
        for (ItemStack stack : event.player.inventory.mainInventory) {
          // System.out.println(stack.getItem());
        }
      }
    }
  }
}