package mrthomas20121.create_tools;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class CreateTags {

    public static class Blocks {

        public static TagKey<Block> NEEDS_BRASS_TOOLS = create("create:needs_brass_tools");
        public static TagKey<Block> NEEDS_ANDESITE_ALLOY_TOOLS = create("create:needs_brass_tools");

        public static TagKey<Block> create(String name) {
            return TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(name));
        }
    }

    public static class Items {

        public static TagKey<Item> BRASS_INGOT = create("forge:ingots/brass");
        public static TagKey<Item> ANDESITE_ALLOY_INGOT = create("forge:ingots/andesite_alloy");

        public static TagKey<Item> create(String name) {
            return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(name));
        }
    }
}
