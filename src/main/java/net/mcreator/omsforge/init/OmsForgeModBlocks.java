
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.omsforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.omsforge.block.SteelBlockBlock;
import net.mcreator.omsforge.block.SilverOreBlock;
import net.mcreator.omsforge.block.SilverBlockBlock;
import net.mcreator.omsforge.block.PlatinumOreEndBlock;
import net.mcreator.omsforge.block.PlatinumOreBlock;
import net.mcreator.omsforge.block.ElectrumOreBlock;
import net.mcreator.omsforge.block.DeepslatePlatinumOreBlock;
import net.mcreator.omsforge.OmsForgeMod;

public class OmsForgeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OmsForgeMod.MODID);
	public static final RegistryObject<Block> SILVER_ORE = REGISTRY.register("silver_ore", () -> new SilverOreBlock());
	public static final RegistryObject<Block> ELECTRUM_ORE = REGISTRY.register("electrum_ore", () -> new ElectrumOreBlock());
	public static final RegistryObject<Block> SILVER_BLOCK = REGISTRY.register("silver_block", () -> new SilverBlockBlock());
	public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new SteelBlockBlock());
	public static final RegistryObject<Block> PLATINUM_ORE = REGISTRY.register("platinum_ore", () -> new PlatinumOreBlock());
	public static final RegistryObject<Block> PLATINUM_ORE_END = REGISTRY.register("platinum_ore_end", () -> new PlatinumOreEndBlock());
	public static final RegistryObject<Block> DEEPSLATE_PLATINUM_ORE = REGISTRY.register("deepslate_platinum_ore",
			() -> new DeepslatePlatinumOreBlock());
}
