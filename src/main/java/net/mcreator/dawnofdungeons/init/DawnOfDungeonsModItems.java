
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dawnofdungeons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.dawnofdungeons.item.ScrollOfTheRamShieldItem;
import net.mcreator.dawnofdungeons.item.ScrollOfTheHealingShieldItem;
import net.mcreator.dawnofdungeons.item.ScrollOfStrengthItem;
import net.mcreator.dawnofdungeons.item.ScrollOfSpeedyHealingItem;
import net.mcreator.dawnofdungeons.item.ScrollOfSpeedItem;
import net.mcreator.dawnofdungeons.item.ScrollOfSonicShieldingItem;
import net.mcreator.dawnofdungeons.item.ScrollOfShieldingItem;
import net.mcreator.dawnofdungeons.item.ScrollOfRegenerationItem;
import net.mcreator.dawnofdungeons.item.ScrollOfKnockbackItem;
import net.mcreator.dawnofdungeons.item.ScrollOfDrainingItem;
import net.mcreator.dawnofdungeons.item.ProjectileItem;
import net.mcreator.dawnofdungeons.item.BulletItem;
import net.mcreator.dawnofdungeons.DawnOfDungeonsMod;

public class DawnOfDungeonsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DawnOfDungeonsMod.MODID);
	public static final RegistryObject<Item> SCROLL_OF_SPEED = REGISTRY.register("scroll_of_speed", () -> new ScrollOfSpeedItem());
	public static final RegistryObject<Item> SCROLL_OF_REGENERATION = REGISTRY.register("scroll_of_regeneration",
			() -> new ScrollOfRegenerationItem());
	public static final RegistryObject<Item> SCROLL_OF_STRENGTH = REGISTRY.register("scroll_of_strength", () -> new ScrollOfStrengthItem());
	public static final RegistryObject<Item> SCROLL_OF_SHIELDING = REGISTRY.register("scroll_of_shielding", () -> new ScrollOfShieldingItem());
	public static final RegistryObject<Item> SCROLL_OF_DRAINING = REGISTRY.register("scroll_of_draining", () -> new ScrollOfDrainingItem());
	public static final RegistryObject<Item> BULLET = REGISTRY.register("bullet", () -> new BulletItem());
	public static final RegistryObject<Item> SCROLL_OF_KNOCKBACK = REGISTRY.register("scroll_of_knockback", () -> new ScrollOfKnockbackItem());
	public static final RegistryObject<Item> PROJECTILE = REGISTRY.register("projectile", () -> new ProjectileItem());
	public static final RegistryObject<Item> SCROLL_OF_SPEEDY_HEALING = REGISTRY.register("scroll_of_speedy_healing",
			() -> new ScrollOfSpeedyHealingItem());
	public static final RegistryObject<Item> SCROLL_OF_SONIC_SHIELDING = REGISTRY.register("scroll_of_sonic_shielding",
			() -> new ScrollOfSonicShieldingItem());
	public static final RegistryObject<Item> SCROLL_OF_THE_HEALING_SHIELD = REGISTRY.register("scroll_of_the_healing_shield",
			() -> new ScrollOfTheHealingShieldItem());
	public static final RegistryObject<Item> SCROLL_OF_THE_RAM_SHIELD = REGISTRY.register("scroll_of_the_ram_shield",
			() -> new ScrollOfTheRamShieldItem());
	public static final RegistryObject<Item> FUSION_RIFT = block(DawnOfDungeonsModBlocks.FUSION_RIFT, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
