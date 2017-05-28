package com.allevaton.diablocraft;

import com.allevaton.diablocraft.events.Events;
import com.allevaton.diablocraft.rng.RNG;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = DiabloCraft.MODID, version = DiabloCraft.VERSION)
public class DiabloCraft {
  public static final String MODID = "diablocraft";
  public static final String VERSION = "0.1";

  @EventHandler
  public void init(FMLInitializationEvent event) {
    // Setup weighted random number generators
    RNG.setupRarities();
    
    // Hook up events
    Events.registerEvents();
  }
}
