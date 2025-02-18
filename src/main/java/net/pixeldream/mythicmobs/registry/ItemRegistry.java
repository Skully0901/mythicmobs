package net.pixeldream.mythicmobs.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.pixeldream.mythicmobs.item.KoboldSpearItem;

import static net.pixeldream.mythicmobs.MythicMobs.ITEM_GROUP;
import static net.pixeldream.mythicmobs.MythicMobs.MOD_ID;

public class ItemRegistry {
    public static final Item AUTOMATON_SPAWN_EGG = new SpawnEggItem(EntityRegistry.AUTOMATON_ENTITY, 0xcf9611, 0xa87807, new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final Item KOBOLD_SPAWN_EGG = new SpawnEggItem(EntityRegistry.KOBOLD_ENTITY, 0xd5f07d, 0x637036, new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final Item KOBOLD_WARRIOR_SPAWN_EGG = new SpawnEggItem(EntityRegistry.KOBOLD_WARRIOR_ENTITY, 0xd5f07d, 0xe6b800, new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final Item CHUPACABRA_SPAWN_EGG = new SpawnEggItem(EntityRegistry.CHUPACABRA_ENTITY, 0x8E7870, 0xDA5126, new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
//    public static final Item WENDIGO_SPAWN_EGG = new SpawnEggItem(EntityRegistry.WENDIGO_ENTITY, 0x9f906f, 0x473a1f, new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final Item DRAKE_SPAWN_EGG = new SpawnEggItem(EntityRegistry.DRAKE_ENTITY, 0xFE6F42, 0xE54B1A, new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final Item MUSHROOM_SPAWN_EGG = new SpawnEggItem(EntityRegistry.MUSHROOM_ENTITY, 0xE53935, 0xFEFEFE, new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final KoboldSpearItem KOBOLD_SPEAR = new KoboldSpearItem(ToolMaterials.IRON, 3, -2.0f, new Item.Settings().group(ITEM_GROUP).maxCount(1).rarity(Rarity.UNCOMMON));
    //    public static final AutomatonAxeItem AUTOMATON_AXE = new AutomatonAxeItem(ToolMaterials.GOLD, 8, -3.25f, new Item.Settings().group(ITEM_GROUP).maxCount(1).rarity(Rarity.EPIC));
    public static final Item BRONZE_INGOT = new Item(new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final BlockItem BRONZE_BLOCK = new BlockItem(BlockRegistry.BRONZE_BLOCK, new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
    public static final BlockItem BRONZE_BLOCK_CUT = new BlockItem(BlockRegistry.CUT_BRONZE_BLOCK, new FabricItemSettings().group(ITEM_GROUP).maxCount(64));
//    public static final BlockItem DRAKE_EGG_BLOCK = new BlockItem(BlockRegistry.DRAKE_EGG_BLOCK, new FabricItemSettings().group(ITEM_GROUP).maxCount(16));
    public static final Item AUTOMATON_HEAD = new Item(new FabricItemSettings().maxCount(1));
    public static final Item CHUPACABRA_RAW_MEAT = new Item(new FabricItemSettings().group(ITEM_GROUP).maxCount(64).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.8F).meat().build()));
    public static final Item CHUPACABRA_COOKED_MEAT_SKEWER = new Item(new FabricItemSettings().group(ITEM_GROUP).maxCount(64).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8F).meat().build()));
    public static final Item GEAR = new Item(new FabricItemSettings().maxCount(64).group(ITEM_GROUP));

    public ItemRegistry() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "kobold_spear"), KOBOLD_SPEAR);
//        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "automaton_axe"), AUTOMATON_AXE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "automaton_head"), AUTOMATON_HEAD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bronze_ingot"), BRONZE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chupacabra_raw_meat"), CHUPACABRA_RAW_MEAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chupacabra_cooked_meat_skewer"), CHUPACABRA_COOKED_MEAT_SKEWER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gear"), GEAR);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bronze_block"), BRONZE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bronze_block_cut"), BRONZE_BLOCK_CUT);
//        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "drake_egg"), DRAKE_EGG_BLOCK);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "automaton_spawn_egg"), AUTOMATON_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "kobold_spawn_egg"), KOBOLD_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "kobold_warrior_spawn_egg"), KOBOLD_WARRIOR_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chupacabra_spawn_egg"), CHUPACABRA_SPAWN_EGG);
//        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wendigo_spawn_egg"), WENDIGO_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "drake_spawn_egg"), DRAKE_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mushroom_spawn_egg"), MUSHROOM_SPAWN_EGG);
    }
}
