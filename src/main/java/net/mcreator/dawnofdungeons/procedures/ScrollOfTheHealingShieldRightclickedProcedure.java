package net.mcreator.dawnofdungeons.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class ScrollOfTheHealingShieldRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x + 1, y, z + 1), Blocks.POINTED_DRIPSTONE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y + 1, z + 1), Blocks.POINTED_DRIPSTONE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y + 2, z + 1), Blocks.POINTED_DRIPSTONE.defaultBlockState(), 3);
	}
}
