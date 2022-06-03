
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.omsforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.omsforge.item.SuperPickaxeItem;
import net.mcreator.omsforge.item.SteelhueItem;
import net.mcreator.omsforge.item.SteelSwordItem;
import net.mcreator.omsforge.item.SteelShovelItem;
import net.mcreator.omsforge.item.SteelPickaxeItem;
import net.mcreator.omsforge.item.SteelIngotItem;
import net.mcreator.omsforge.item.SteelAxeItem;
import net.mcreator.omsforge.item.SteelArmorItem;
import net.mcreator.omsforge.item.SilverSwordItem;
import net.mcreator.omsforge.item.SilverNuggetItem;
import net.mcreator.omsforge.item.SilverIngotItem;
import net.mcreator.omsforge.item.PlatinumingotItem;
import net.mcreator.omsforge.item.PlatinumSwordItem;
import net.mcreator.omsforge.item.PlatinumPickaxeItem;
import net.mcreator.omsforge.item.PlatinumNuggetItem;
import net.mcreator.omsforge.item.PlatinumArmorItem;
import net.mcreator.omsforge.item.PelmenItem;
import net.mcreator.omsforge.item.NetheritePlatinumLegginsItem;
import net.mcreator.omsforge.item.NetheritePlatinumHelmetItem;
import net.mcreator.omsforge.item.NetheritePlatinumChestplateItem;
import net.mcreator.omsforge.item.NetheritePlatinumBootsItem;
import net.mcreator.omsforge.item.MethItem;
import net.mcreator.omsforge.item.IronStickItem;
import net.mcreator.omsforge.item.Iphone13ProItem;
import net.mcreator.omsforge.item.HardenedSteelSwordItem;
import net.mcreator.omsforge.item.HardenedSteelShovelItem;
import net.mcreator.omsforge.item.HardenedSteelPickaxeItem;
import net.mcreator.omsforge.item.HardenedSteelHoeItem;
import net.mcreator.omsforge.item.HardenedSteelAxeItem;
import net.mcreator.omsforge.item.HardenedSteelArmorItem;
import net.mcreator.omsforge.item.FlashItem;
import net.mcreator.omsforge.item.ElectrumSwordItem;
import net.mcreator.omsforge.item.ElectrumIngotItem;
import net.mcreator.omsforge.item.ElectrumArmorItem;
import net.mcreator.omsforge.item.BanArmorItem;
import net.mcreator.omsforge.item.AlmostPlatinumLegginsItem;
import net.mcreator.omsforge.item.AlmostPlatinumChestplateItem;
import net.mcreator.omsforge.OmsForgeMod;

public class OmsForgeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OmsForgeMod.MODID);
	public static final RegistryObject<Item> SILVER_ORE = block(OmsForgeModBlocks.SILVER_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SILVER_NUGGET = REGISTRY.register("silver_nugget", () -> new SilverNuggetItem());
	public static final RegistryObject<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new SilverIngotItem());
	public static final RegistryObject<Item> SILVER_SWORD = REGISTRY.register("silver_sword", () -> new SilverSwordItem());
	public static final RegistryObject<Item> PLATINUMINGOT = REGISTRY.register("platinumingot", () -> new PlatinumingotItem());
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> STEEL_SWORD = REGISTRY.register("steel_sword", () -> new SteelSwordItem());
	public static final RegistryObject<Item> IRON_STICK = REGISTRY.register("iron_stick", () -> new IronStickItem());
	public static final RegistryObject<Item> HARDENED_STEEL_SWORD = REGISTRY.register("hardened_steel_sword", () -> new HardenedSteelSwordItem());
	public static final RegistryObject<Item> ELECTRUM_ORE = block(OmsForgeModBlocks.ELECTRUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ELECTRUM_INGOT = REGISTRY.register("electrum_ingot", () -> new ElectrumIngotItem());
	public static final RegistryObject<Item> ELECTRUM_SWORD = REGISTRY.register("electrum_sword", () -> new ElectrumSwordItem());
	public static final RegistryObject<Item> SILVER_BLOCK = block(OmsForgeModBlocks.SILVER_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STEEL_ARMOR_HELMET = REGISTRY.register("steel_armor_helmet", () -> new SteelArmorItem.Helmet());
	public static final RegistryObject<Item> STEEL_ARMOR_CHESTPLATE = REGISTRY.register("steel_armor_chestplate",
			() -> new SteelArmorItem.Chestplate());
	public static final RegistryObject<Item> STEEL_ARMOR_LEGGINGS = REGISTRY.register("steel_armor_leggings", () -> new SteelArmorItem.Leggings());
	public static final RegistryObject<Item> STEEL_ARMOR_BOOTS = REGISTRY.register("steel_armor_boots", () -> new SteelArmorItem.Boots());
	public static final RegistryObject<Item> STEEL_PICKAXE = REGISTRY.register("steel_pickaxe", () -> new SteelPickaxeItem());
	public static final RegistryObject<Item> HARDENED_STEEL_PICKAXE = REGISTRY.register("hardened_steel_pickaxe",
			() -> new HardenedSteelPickaxeItem());
	public static final RegistryObject<Item> HARDENED_STEEL_ARMOR_HELMET = REGISTRY.register("hardened_steel_armor_helmet",
			() -> new HardenedSteelArmorItem.Helmet());
	public static final RegistryObject<Item> HARDENED_STEEL_ARMOR_CHESTPLATE = REGISTRY.register("hardened_steel_armor_chestplate",
			() -> new HardenedSteelArmorItem.Chestplate());
	public static final RegistryObject<Item> HARDENED_STEEL_ARMOR_LEGGINGS = REGISTRY.register("hardened_steel_armor_leggings",
			() -> new HardenedSteelArmorItem.Leggings());
	public static final RegistryObject<Item> HARDENED_STEEL_ARMOR_BOOTS = REGISTRY.register("hardened_steel_armor_boots",
			() -> new HardenedSteelArmorItem.Boots());
	public static final RegistryObject<Item> STEEL_SHOVEL = REGISTRY.register("steel_shovel", () -> new SteelShovelItem());
	public static final RegistryObject<Item> STEEL_AXE = REGISTRY.register("steel_axe", () -> new SteelAxeItem());
	public static final RegistryObject<Item> HARDENED_STEEL_AXE = REGISTRY.register("hardened_steel_axe", () -> new HardenedSteelAxeItem());
	public static final RegistryObject<Item> STEELHUE = REGISTRY.register("steelhue", () -> new SteelhueItem());
	public static final RegistryObject<Item> HARDENED_STEEL_SHOVEL = REGISTRY.register("hardened_steel_shovel", () -> new HardenedSteelShovelItem());
	public static final RegistryObject<Item> HARDENED_STEEL_HOE = REGISTRY.register("hardened_steel_hoe", () -> new HardenedSteelHoeItem());
	public static final RegistryObject<Item> STEEL_BLOCK = block(OmsForgeModBlocks.STEEL_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PLATINUM_ORE = block(OmsForgeModBlocks.PLATINUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PLATINUM_ORE_END = block(OmsForgeModBlocks.PLATINUM_ORE_END, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ELECTRUM_ARMOR_HELMET = REGISTRY.register("electrum_armor_helmet", () -> new ElectrumArmorItem.Helmet());
	public static final RegistryObject<Item> ELECTRUM_ARMOR_CHESTPLATE = REGISTRY.register("electrum_armor_chestplate",
			() -> new ElectrumArmorItem.Chestplate());
	public static final RegistryObject<Item> ELECTRUM_ARMOR_LEGGINGS = REGISTRY.register("electrum_armor_leggings",
			() -> new ElectrumArmorItem.Leggings());
	public static final RegistryObject<Item> ELECTRUM_ARMOR_BOOTS = REGISTRY.register("electrum_armor_boots", () -> new ElectrumArmorItem.Boots());
	public static final RegistryObject<Item> PLATINUM_ARMOR_HELMET = REGISTRY.register("platinum_armor_helmet", () -> new PlatinumArmorItem.Helmet());
	public static final RegistryObject<Item> PLATINUM_ARMOR_CHESTPLATE = REGISTRY.register("platinum_armor_chestplate",
			() -> new PlatinumArmorItem.Chestplate());
	public static final RegistryObject<Item> PLATINUM_ARMOR_LEGGINGS = REGISTRY.register("platinum_armor_leggings",
			() -> new PlatinumArmorItem.Leggings());
	public static final RegistryObject<Item> PLATINUM_ARMOR_BOOTS = REGISTRY.register("platinum_armor_boots", () -> new PlatinumArmorItem.Boots());
	public static final RegistryObject<Item> IPHONE_13_PRO = REGISTRY.register("iphone_13_pro", () -> new Iphone13ProItem());
	public static final RegistryObject<Item> PLATINUM_NUGGET = REGISTRY.register("platinum_nugget", () -> new PlatinumNuggetItem());
	public static final RegistryObject<Item> SUPER_PICKAXE = REGISTRY.register("super_pickaxe", () -> new SuperPickaxeItem());
	public static final RegistryObject<Item> BAN_ARMOR_HELMET = REGISTRY.register("ban_armor_helmet", () -> new BanArmorItem.Helmet());
	public static final RegistryObject<Item> BAN_ARMOR_CHESTPLATE = REGISTRY.register("ban_armor_chestplate", () -> new BanArmorItem.Chestplate());
	public static final RegistryObject<Item> BAN_ARMOR_LEGGINGS = REGISTRY.register("ban_armor_leggings", () -> new BanArmorItem.Leggings());
	public static final RegistryObject<Item> BAN_ARMOR_BOOTS = REGISTRY.register("ban_armor_boots", () -> new BanArmorItem.Boots());
	public static final RegistryObject<Item> NETHERITE_PLATINUM_HELMET = REGISTRY.register("netherite_platinum_helmet",
			() -> new NetheritePlatinumHelmetItem());
	public static final RegistryObject<Item> NETHERITE_PLATINUM_CHESTPLATE = REGISTRY.register("netherite_platinum_chestplate",
			() -> new NetheritePlatinumChestplateItem());
	public static final RegistryObject<Item> NETHERITE_PLATINUM_LEGGINS = REGISTRY.register("netherite_platinum_leggins",
			() -> new NetheritePlatinumLegginsItem());
	public static final RegistryObject<Item> NETHERITE_PLATINUM_BOOTS = REGISTRY.register("netherite_platinum_boots",
			() -> new NetheritePlatinumBootsItem());
	public static final RegistryObject<Item> ALMOST_PLATINUM_CHESTPLATE = REGISTRY.register("almost_platinum_chestplate",
			() -> new AlmostPlatinumChestplateItem());
	public static final RegistryObject<Item> ALMOST_PLATINUM_LEGGINS = REGISTRY.register("almost_platinum_leggins",
			() -> new AlmostPlatinumLegginsItem());
	public static final RegistryObject<Item> PLATINUM_PICKAXE = REGISTRY.register("platinum_pickaxe", () -> new PlatinumPickaxeItem());
	public static final RegistryObject<Item> PLATINUM_SWORD = REGISTRY.register("platinum_sword", () -> new PlatinumSwordItem());
	public static final RegistryObject<Item> FLASH = REGISTRY.register("flash", () -> new FlashItem());
	public static final RegistryObject<Item> PELMEN = REGISTRY.register("pelmen", () -> new PelmenItem());
	public static final RegistryObject<Item> METH = REGISTRY.register("meth", () -> new MethItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
