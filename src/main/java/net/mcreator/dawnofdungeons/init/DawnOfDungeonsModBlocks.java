
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dawnofdungeons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.dawnofdungeons.block.FusionRiftBlock;
import net.mcreator.dawnofdungeons.DawnOfDungeonsMod;

public class DawnOfDungeonsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DawnOfDungeonsMod.MODID);
	public static final RegistryObject<Block> FUSION_RIFT = REGISTRY.register("fusion_rift", () -> new FusionRiftBlock());
}
