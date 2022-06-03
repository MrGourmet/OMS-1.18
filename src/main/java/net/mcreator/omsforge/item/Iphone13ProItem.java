
package net.mcreator.omsforge.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.omsforge.init.OmsForgeModTabs;

public class Iphone13ProItem extends Item {
	public Iphone13ProItem() {
		super(new Item.Properties().tab(OmsForgeModTabs.TAB_FUN).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
