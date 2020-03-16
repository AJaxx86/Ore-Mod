package net.mcreator.test;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@Elementstest.ModElement.Tag
public class MCreatorInfuseddiamondsword extends Elementstest.ModElement {
	@ObjectHolder("test:infuseddiamondsword")
	public static final Item block = null;

	public MCreatorInfuseddiamondsword(Elementstest instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1824;
			}

			public float getEfficiency() {
				return 2f;
			}

			public float getAttackDamage() {
				return 6.5f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MCreatorInfused_diamondGem.block, (int) (1)));
			}
		}, 3, -2.4000000000000001F, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("infuseddiamondsword"));
	}
}
