package net.mcreator.dawnofdungeons.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

public class ScrollOfTheHealingShieldRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(new BlockPos(x + 1, y, z + 1), Blocks.POINTED_DRIPSTONE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y + 1, z + 1), Blocks.POINTED_DRIPSTONE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y + 2, z + 1), Blocks.POINTED_DRIPSTONE.defaultBlockState(), 3);
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 480, 1, (false), (false)));
	}
}
