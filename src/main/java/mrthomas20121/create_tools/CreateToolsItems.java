package mrthomas20121.create_tools;

import cofh.core.item.*;
import cofh.lib.item.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static cofh.toolscomplement.ToolsComplement.TCOM_GROUP;

public class CreateToolsItems {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateTools.MOD_ID);

    public static Item.Properties properties = new Item.Properties().tab(TCOM_GROUP);

    // Brass set
    public static RegistryObject<AxeItemCoFH> BRASS_AXE = ITEMS.register("brass_axe", () -> new AxeItemCoFH(CreateToolTiers.BRASS, 6, -3.1f, properties));
    public static RegistryObject<HoeItemCoFH> BRASS_HOE = ITEMS.register("brass_hoe", () -> new HoeItemCoFH(CreateToolTiers.BRASS, -2, -1f, properties));
    public static RegistryObject<PickaxeItemCoFH> BRASS_PICKAXE = ITEMS.register("brass_pickaxe", () -> new PickaxeItemCoFH(CreateToolTiers.BRASS, 1, -2.8f, properties));
    public static RegistryObject<ShovelItemCoFH> BRASS_SHOVEL = ITEMS.register("brass_shovel", () -> new ShovelItemCoFH(CreateToolTiers.BRASS, 1.5f, -3f, properties));
    public static RegistryObject<SwordItemCoFH> BRASS_SWORD = ITEMS.register("brass_sword", () -> new SwordItemCoFH(CreateToolTiers.BRASS, 3, -2.4f, properties));
    public static RegistryObject<ExcavatorItem> BRASS_EXCAVATOR = ITEMS.register("brass_excavator", () -> new ExcavatorItem(CreateToolTiers.BRASS, properties));
    public static RegistryObject<HammerItem> BRASS_HAMMER = ITEMS.register("brass_hammer", () -> new HammerItem(CreateToolTiers.BRASS, properties));
    public static RegistryObject<KnifeItem> BRASS_KNIFE = ITEMS.register("brass_knife", () -> new KnifeItem(CreateToolTiers.BRASS, properties));
    public static RegistryObject<SickleItem> BRASS_SICKLE = ITEMS.register("brass_sickle", () -> new SickleItem(CreateToolTiers.BRASS, properties));
    public static RegistryObject<ArmorItemCoFH> BRASS_HELMET = ITEMS.register("brass_helmet", () -> new ArmorItemCoFH(CreateArmorMaterials.BRASS, EquipmentSlot.HEAD, properties).setModId(CreateTools.MOD_ID));
    public static RegistryObject<ArmorItemCoFH> BRASS_CHESTPLATE = ITEMS.register("brass_chestplate", () -> new ArmorItemCoFH(CreateArmorMaterials.BRASS, EquipmentSlot.CHEST, properties).setModId(CreateTools.MOD_ID));
    public static RegistryObject<ArmorItemCoFH> BRASS_LEGGINGS = ITEMS.register("brass_leggings", () -> new ArmorItemCoFH(CreateArmorMaterials.BRASS, EquipmentSlot.LEGS, properties).setModId(CreateTools.MOD_ID));
    public static RegistryObject<ArmorItemCoFH> BRASS_BOOTS = ITEMS.register("brass_boots", () -> new ArmorItemCoFH(CreateArmorMaterials.BRASS, EquipmentSlot.FEET, properties).setModId(CreateTools.MOD_ID));
    // Andesite Alloy Set
    public static RegistryObject<AxeItemCoFH> ANDESITE_ALLOY_AXE = ITEMS.register("andesite_alloy_axe", () -> new AxeItemCoFH(CreateToolTiers.ANDESITE_ALLOY, 6, -3.1f, properties));
    public static RegistryObject<HoeItemCoFH> ANDESITE_ALLOY_HOE = ITEMS.register("andesite_alloy_hoe", () -> new HoeItemCoFH(CreateToolTiers.ANDESITE_ALLOY, -2, -1f, properties));
    public static RegistryObject<PickaxeItemCoFH> ANDESITE_ALLOY_PICKAXE = ITEMS.register("andesite_alloy_pickaxe", () -> new PickaxeItemCoFH(CreateToolTiers.ANDESITE_ALLOY, 1, -2.8f, properties));
    public static RegistryObject<ShovelItemCoFH> ANDESITE_ALLOY_SHOVEL = ITEMS.register("andesite_alloy_shovel", () -> new ShovelItemCoFH(CreateToolTiers.ANDESITE_ALLOY, 1.5f, -3f, properties));
    public static RegistryObject<SwordItemCoFH> ANDESITE_ALLOY_SWORD = ITEMS.register("andesite_alloy_sword", () -> new SwordItemCoFH(CreateToolTiers.ANDESITE_ALLOY, 3, -2.4f, properties));
    public static RegistryObject<ExcavatorItem> ANDESITE_ALLOY_EXCAVATOR = ITEMS.register("andesite_alloy_excavator", () -> new ExcavatorItem(CreateToolTiers.ANDESITE_ALLOY, 1.5f, 3.2f, properties));
    public static RegistryObject<HammerItem> ANDESITE_ALLOY_HAMMER = ITEMS.register("andesite_alloy_hammer", () -> new HammerItem(CreateToolTiers.ANDESITE_ALLOY, 3.5f, -3.4f, properties));
    public static RegistryObject<KnifeItem> ANDESITE_ALLOY_KNIFE = ITEMS.register("andesite_alloy_knife", () -> new KnifeItem(CreateToolTiers.ANDESITE_ALLOY, 1, -2.1f, properties));
    public static RegistryObject<SickleItem> ANDESITE_ALLOY_SICKLE = ITEMS.register("andesite_alloy_sickle", () -> new SickleItem(CreateToolTiers.ANDESITE_ALLOY, 2, properties));
    public static RegistryObject<ArmorItemCoFH> ANDESITE_ALLOY_HELMET = ITEMS.register("andesite_alloy_helmet", () -> new ArmorItemCoFH(CreateArmorMaterials.ANDESITE_ALLOY, EquipmentSlot.HEAD, properties).setModId(CreateTools.MOD_ID));
    public static RegistryObject<ArmorItemCoFH> ANDESITE_ALLOY_CHESTPLATE = ITEMS.register("andesite_alloy_chestplate", () -> new ArmorItemCoFH(CreateArmorMaterials.ANDESITE_ALLOY, EquipmentSlot.CHEST, properties).setModId(CreateTools.MOD_ID));
    public static RegistryObject<ArmorItemCoFH> ANDESITE_ALLOY_LEGGINGS = ITEMS.register("andesite_alloy_leggings", () -> new ArmorItemCoFH(CreateArmorMaterials.ANDESITE_ALLOY, EquipmentSlot.LEGS, properties).setModId(CreateTools.MOD_ID));
    public static RegistryObject<ArmorItemCoFH> ANDESITE_ALLOY_BOOTS = ITEMS.register("andesite_alloy_boots", () -> new ArmorItemCoFH(CreateArmorMaterials.ANDESITE_ALLOY, EquipmentSlot.FEET, properties).setModId(CreateTools.MOD_ID));
}