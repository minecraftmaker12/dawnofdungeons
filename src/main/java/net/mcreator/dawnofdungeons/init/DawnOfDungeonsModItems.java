
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dawnofdungeons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.dawnofdungeons.item.ScrollOfSpeedItem;
import net.mcreator.dawnofdungeons.DawnOfDungeonsMod;

public class DawnOfDungeonsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DawnOfDungeonsMod.MODID);
	public static final RegistryObject<Item> SCROLL_OF_SPEED = REGISTRY.register("scroll_of_speed", () -> new ScrollOfSpeedItem());
}
