
package net.mcreator.omsforge.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.omsforge.init.OmsForgeModTabs;

public class SuperPickaxeItem extends PickaxeItem {
	public SuperPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 100050f;
			}

			public float getAttackDamageBonus() {
				return 998f;
			}

			public int getLevel() {
				return 20;
			}

			public int getEnchantmentValue() {
				return 100303;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.BEDROCK));
			}
		}, 1, 96f, new Item.Properties().tab(OmsForgeModTabs.TAB_FUN).fireResistant());
	}
}
