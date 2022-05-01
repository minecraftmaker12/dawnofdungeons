
package net.mcreator.dawnofdungeons.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.InteractionResult;

import net.mcreator.dawnofdungeons.procedures.ScrollOfStrengthRightclickedOnBlockProcedure;

public class ScrollOfStrengthItem extends Item {
	public ScrollOfStrengthItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(0).saturationMod(3f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		ScrollOfStrengthRightclickedOnBlockProcedure.execute(context.getPlayer());
		return retval;
	}
}
