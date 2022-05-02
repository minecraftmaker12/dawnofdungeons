
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.dawnofdungeons.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerProfession;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class DawnOfDungeonsModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.CLERIC) {
			trades.get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(DawnOfDungeonsModItems.SCROLL_OF_REGENERATION.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			trades.get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(DawnOfDungeonsModItems.SCROLL_OF_SHIELDING.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.BUTCHER) {
			trades.get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(DawnOfDungeonsModItems.SCROLL_OF_STRENGTH.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FLETCHER) {
			trades.get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(DawnOfDungeonsModItems.SCROLL_OF_SPEED.get()), 10, 5, 0.05f));
		}
	}
}
