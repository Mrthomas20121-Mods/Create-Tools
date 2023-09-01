package mrthomas20121.create_tools;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.util.Lazy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public enum CreateToolTiers implements Tier {

    BRASS(2, 150, 6.1F, 2.1F, 18, () -> Ingredient.of(CreateTags.Items.BRASS_INGOT), CreateTags.Blocks.NEEDS_BRASS_TOOLS),
    ANDESITE_ALLOY(2, 300, 4.0F, 1.5F, 18, () -> Ingredient.of(CreateTags.Items.ANDESITE_ALLOY_INGOT), CreateTags.Blocks.NEEDS_ANDESITE_ALLOY_TOOLS);

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Lazy<Ingredient> repairIngredient;
    private final TagKey<Block> tagKey;

    CreateToolTiers(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> suplier, TagKey<Block> tagKey) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = Lazy.of(suplier);
        this.tagKey = tagKey;
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    @Nullable
    public net.minecraft.tags.TagKey<net.minecraft.world.level.block.Block> getTag() { return tagKey; }

}
