
package net.mcreator.dawnofdungeons.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.dawnofdungeons.procedures.ScrollOfTheHealingShieldRightclickedProcedure;

public class ScrollOfTheHealingShieldItem extends Item {
	public ScrollOfTheHealingShieldItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).durability(1).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).alwaysEat()

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ScrollOfTheHealingShieldRightclickedProcedure.execute(world, x, y, z, entity);
		return ar;
	}
}
