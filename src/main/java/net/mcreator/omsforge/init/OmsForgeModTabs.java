
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.omsforge.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class OmsForgeModTabs {
	public static CreativeModeTab TAB_FUN;

	public static void load() {
		TAB_FUN = new CreativeModeTab("tabfun") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(OmsForgeModItems.IPHONE_13_PRO.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
