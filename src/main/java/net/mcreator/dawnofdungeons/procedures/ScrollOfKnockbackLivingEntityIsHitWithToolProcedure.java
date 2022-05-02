package net.mcreator.dawnofdungeons.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.dawnofdungeons.entity.ProjectileEntity;

public class ScrollOfKnockbackLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
			ProjectileEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 2, 5, 5);
		}
	}
}
