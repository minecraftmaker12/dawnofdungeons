
package net.mcreator.dawnofdungeons.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.dawnofdungeons.procedures.ScrollOfTheRamShieldLivingEntityIsHitWithItemProcedure;

public class ScrollOfTheRamShieldItem extends Item {
	public ScrollOfTheRamShieldItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).durability(1).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(0).saturationMod(8f).alwaysEat()

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		ScrollOfTheRamShieldLivingEntityIsHitWithItemProcedure.execute(entity, sourceentity);
		return retval;
	}
}
