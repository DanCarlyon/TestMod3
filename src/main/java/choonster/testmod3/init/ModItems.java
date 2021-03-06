package choonster.testmod3.init;

import choonster.testmod3.TestMod3;
import choonster.testmod3.capability.pigspawner.CapabilityPigSpawner;
import choonster.testmod3.capability.pigspawner.PigSpawnerInfinite;
import choonster.testmod3.item.*;
import choonster.testmod3.util.Constants;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.common.registry.IForgeRegistry;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("WeakerAccess")
@ObjectHolder(TestMod3.MODID)
public class ModItems {
	public static class ArmorMaterials {
		public static final ItemArmor.ArmorMaterial ARMOUR_MATERIAL_REPLACEMENT = EnumHelper.addArmorMaterial(Constants.RESOURCE_PREFIX + "replacement", Constants.RESOURCE_PREFIX + "replacement", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, (float) 0);
	}

	public static class ToolMaterials {
		public static final Item.ToolMaterial TOOL_MATERIAL_GLOWSTONE = EnumHelper.addToolMaterial("glowstone", 1, 5, 0.5f, 1.0f, 10);
	}

	@ObjectHolder("wooden_axe")
	public static final ItemCuttingAxe WOODEN_AXE = new ItemCuttingAxe(Item.ToolMaterial.WOOD, "wooden_axe");

	@ObjectHolder("entity_test")
	public static final ItemEntityTest ENTITY_TEST = new ItemEntityTest();

	@ObjectHolder("record_solaris")
	public static final ItemRecordMod RECORD_SOLARIS = new ItemRecordMod("solaris", ModSoundEvents.RECORD_SOLARIS);

	@ObjectHolder("heavy")
	public static final ItemHeavy HEAVY = new ItemHeavy();

	@ObjectHolder("entity_interaction_test")
	public static final ItemEntityInteractionTest ENTITY_INTERACTION_TEST = new ItemEntityInteractionTest();

	@ObjectHolder("block_destroyer")
	public static final ItemBlockDestroyer BLOCK_DESTROYER = new ItemBlockDestroyer();

	@ObjectHolder("subscripts")
	public static final ItemWithSubscripts SUBSCRIPTS = new ItemWithSubscripts();

	@ObjectHolder("superscripts")
	public static final ItemWithSuperscripts SUPERSCRIPTS = new ItemWithSuperscripts();

	@ObjectHolder("model_test")
	public static final ItemLastUseTimeModel MODEL_TEST = new ItemLastUseTimeModel("modeltest");

	@ObjectHolder("snowball_launcher")
	public static final ItemSnowballLauncher SNOWBALL_LAUNCHER = new ItemSnowballLauncher("snowball_launcher");

	@ObjectHolder("slingshot")
	public static final ItemSlingshot SLINGSHOT = new ItemSlingshot();

	@ObjectHolder("unicode_tooltips")
	public static final ItemUnicodeTooltips UNICODE_TOOLTIPS = new ItemUnicodeTooltips();

	@ObjectHolder("swap_test_a")
	public static final ItemSwapTest SWAP_TEST_A = new ItemSwapTest("a");

	@ObjectHolder("swap_test_b")
	public static final ItemSwapTest SWAP_TEST_B = new ItemSwapTest("b");

	@ObjectHolder("block_debugger")
	public static final ItemBlockDebugger BLOCK_DEBUGGER = new ItemBlockDebugger();

	@ObjectHolder("wooden_harvest_sword")
	public static final ItemHarvestSword WOODEN_HARVEST_SWORD = new ItemHarvestSword(Item.ToolMaterial.WOOD, "wooden_harvest_sword");

	@ObjectHolder("diamond_harvest_sword")
	public static final ItemHarvestSword DIAMOND_HARVEST_SWORD = new ItemHarvestSword(Item.ToolMaterial.DIAMOND, "diamond_harvest_sword");

	@ObjectHolder("clearer")
	public static final ItemClearer CLEARER = new ItemClearer();

	@ObjectHolder("bow")
	public static final ItemModBow BOW = new ItemModBow("bow");

	@ObjectHolder("arrow")
	public static final Item ARROW = new ItemModArrow("arrow");

	@ObjectHolder("height_tester")
	public static final ItemHeightTester HEIGHT_TESTER = new ItemHeightTester();

	@ObjectHolder("pig_spawner_finite")
	public static final ItemPigSpawner PIG_SPAWNER_FINITE = new ItemPigSpawner("finite");

	@ObjectHolder("pig_spawner_infinite")
	public static final ItemPigSpawner PIG_SPAWNER_INFINITE = new ItemPigSpawner("infinite");

	@ObjectHolder("continuous_bow")
	public static final ItemContinuousBow CONTINUOUS_BOW = new ItemContinuousBow("continuous_bow");

	@ObjectHolder("respawner")
	public static final ItemRespawner RESPAWNER = new ItemRespawner();

	@ObjectHolder("loot_table_test")
	public static final ItemLootTableTest LOOT_TABLE_TEST = new ItemLootTableTest();

	@ObjectHolder("max_health_setter_item")
	public static final ItemMaxHealthSetter MAX_HEALTH_SETTER_ITEM = new ItemMaxHealthSetter();

	@ObjectHolder("max_health_getter_item")
	public static final ItemMaxHealthGetter MAX_HEALTH_GETTER_ITEM = new ItemMaxHealthGetter();

	@ObjectHolder("gun")
	public static final ItemSoundEffect GUN = new ItemSoundEffect("gun", ModSoundEvents.NINE_MM_FIRE);

	@ObjectHolder("dimension_replacement")
	public static final ItemDimensionReplacement DIMENSION_REPLACEMENT = new ItemDimensionReplacement("dimension_replacement");

	@ObjectHolder("saddle")
	public static final ItemSoundEffect SADDLE = new ItemSoundEffect("saddle", ModSoundEvents.ACTION_SADDLE);

	@ObjectHolder("wooden_slow_sword")
	public static final ItemSlowSword WOODEN_SLOW_SWORD = new ItemSlowSword(Item.ToolMaterial.WOOD, "wooden_slow_sword");

	@ObjectHolder("diamond_slow_sword")
	public static final ItemSlowSword DIAMOND_SLOW_SWORD = new ItemSlowSword(Item.ToolMaterial.DIAMOND, "diamond_slow_sword");

	@ObjectHolder("variants_item")
	public static final ItemVariants VARIANTS_ITEM = new ItemVariants();

	@ObjectHolder("ritual_checker")
	public static final ItemRitualChecker RITUAL_CHECKER = new ItemRitualChecker();

	@ObjectHolder("hidden_block_revealer")
	public static final ItemHiddenBlockRevealer HIDDEN_BLOCK_REVEALER = new ItemHiddenBlockRevealer();

	@ObjectHolder("no_mod_name")
	public static final ItemTestMod3 NO_MOD_NAME = new ItemTestMod3("no_mod_name");


	@ObjectHolder("replacement_helmet")
	public static final ItemArmourReplacement REPLACEMENT_HELMET = new ItemArmourReplacement(ArmorMaterials.ARMOUR_MATERIAL_REPLACEMENT, EntityEquipmentSlot.HEAD, "replacement");

	@ObjectHolder("replacement_chestplate")
	public static final ItemArmourRestricted REPLACEMENT_CHESTPLATE = new ItemArmourRestricted(ArmorMaterials.ARMOUR_MATERIAL_REPLACEMENT, EntityEquipmentSlot.CHEST, "replacement");

	@ObjectHolder("repacement_leggings")
	public static final ItemArmourRestricted REPACEMENT_LEGGINGS = new ItemArmourRestricted(ArmorMaterials.ARMOUR_MATERIAL_REPLACEMENT, EntityEquipmentSlot.LEGS, "replacement");

	@ObjectHolder("replacement_boots")
	public static final ItemArmourRestricted REPLACEMENT_BOOTS = new ItemArmourRestricted(ArmorMaterials.ARMOUR_MATERIAL_REPLACEMENT, EntityEquipmentSlot.FEET, "replacement");

	/**
	 * Initialise this mod's {@link Item}s with any post-registration data.
	 */
	public static void initialiseItems() {
		ToolMaterials.TOOL_MATERIAL_GLOWSTONE.setRepairItem(new ItemStack(Items.GLOWSTONE_DUST));
		ArmorMaterials.ARMOUR_MATERIAL_REPLACEMENT.customCraftingMaterial = ARROW;

		SWAP_TEST_A.setOtherItem(new ItemStack(SWAP_TEST_B));
		SWAP_TEST_B.setOtherItem(new ItemStack(SWAP_TEST_A));

		PIG_SPAWNER_FINITE.setSpawnerFactory(CapabilityPigSpawner.PIG_SPAWNER_CAPABILITY::getDefaultInstance);
		PIG_SPAWNER_INFINITE.setSpawnerFactory(PigSpawnerInfinite::new);

		final ItemStack chest = new ItemStack(REPLACEMENT_CHESTPLATE);
		chest.addEnchantment(Enchantments.SHARPNESS, 1);
		REPLACEMENT_HELMET.setReplacementItems(chest, new ItemStack(REPACEMENT_LEGGINGS), new ItemStack(REPLACEMENT_BOOTS));

		DIMENSION_REPLACEMENT.addReplacement(DimensionType.NETHER, new ItemStack(Items.NETHER_STAR));
		DIMENSION_REPLACEMENT.addReplacement(DimensionType.THE_END, new ItemStack(Items.ENDER_PEARL));
	}

	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		public static final Set<Item> ITEMS = new HashSet<>();

		/**
		 * Register this mod's {@link Item}s.
		 *
		 * @param event The event
		 */
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			final Item[] items = {
					WOODEN_AXE,
					ENTITY_TEST,
					RECORD_SOLARIS,
					HEAVY,
					ENTITY_INTERACTION_TEST,
					BLOCK_DESTROYER,
					SUBSCRIPTS,
					SUPERSCRIPTS,
					MODEL_TEST,
					SNOWBALL_LAUNCHER,
					SLINGSHOT,
					UNICODE_TOOLTIPS,
					SWAP_TEST_A,
					SWAP_TEST_B,
					BLOCK_DEBUGGER,
					WOODEN_HARVEST_SWORD,
					DIAMOND_HARVEST_SWORD,
					CLEARER,
					BOW,
					ARROW,
					HEIGHT_TESTER,
					PIG_SPAWNER_FINITE,
					PIG_SPAWNER_INFINITE,
					CONTINUOUS_BOW,
					RESPAWNER,
					LOOT_TABLE_TEST,
					MAX_HEALTH_SETTER_ITEM,
					MAX_HEALTH_GETTER_ITEM,
					GUN,
					DIMENSION_REPLACEMENT,
					SADDLE,
					WOODEN_SLOW_SWORD,
					DIAMOND_SLOW_SWORD,
					VARIANTS_ITEM,
					RITUAL_CHECKER,
					HIDDEN_BLOCK_REVEALER,
					NO_MOD_NAME,
					REPLACEMENT_HELMET,
					REPLACEMENT_CHESTPLATE,
					REPACEMENT_LEGGINGS,
					REPLACEMENT_BOOTS,
			};

			final IForgeRegistry<Item> registry = event.getRegistry();

			for (final Item item : items) {
				registry.register(item);
				ITEMS.add(item);
			}
		}
	}
}
