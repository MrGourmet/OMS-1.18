
package net.mcreator.omsforge.world.features.ores;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.omsforge.init.OmsForgeModBlocks;

import java.util.Set;
import java.util.Random;
import java.util.List;

public class SilverOreFeature extends OreFeature {
	public static SilverOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new SilverOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("oms_forge:silver_ore", FEATURE,
				new OreConfiguration(SilverOreFeatureRuleTest.INSTANCE, OmsForgeModBlocks.SILVER_ORE.get().defaultBlockState(), 8));
		PLACED_FEATURE = PlacementUtils.register("oms_forge:silver_ore", CONFIGURED_FEATURE, List.of(CountPlacement.of(5), InSquarePlacement.spread(),
				HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(58)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("frozen_ocean"), new ResourceLocation("frozen_river"),
			new ResourceLocation("forest"), new ResourceLocation("snowy_plains"), new ResourceLocation("taiga"), new ResourceLocation("snowy_slopes"),
			new ResourceLocation("cold_ocean"), new ResourceLocation("snowy_taiga"), new ResourceLocation("deep_cold_ocean"),
			new ResourceLocation("ice_spikes"), new ResourceLocation("windswept_hills"), new ResourceLocation("old_growth_pine_taiga"),
			new ResourceLocation("frozen_peaks"), new ResourceLocation("old_growth_spruce_taiga"), new ResourceLocation("snowy_beach"));
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public SilverOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class SilverOreFeatureRuleTest extends RuleTest {
		static final SilverOreFeatureRuleTest INSTANCE = new SilverOreFeatureRuleTest();
		private static final com.mojang.serialization.Codec<SilverOreFeatureRuleTest> CODEC = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		private static final RuleTestType<SilverOreFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("oms_forge:silver_ore_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(Blocks.STONE, Blocks.ANDESITE, Blocks.REDSTONE_ORE, Blocks.GOLD_ORE);
			}
			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
