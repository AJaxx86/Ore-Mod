package net.mcreator.test;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

@Elementstest.ModElement.Tag
public class MCreatorInfuseddiamondhoe extends Elementstest.ModElement {
	@ObjectHolder("test:infuseddiamondhoe")
	public static final Item block = null;

	public MCreatorInfuseddiamondhoe(Elementstest instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1824;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 12;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MCreatorInfused_diamondGem.block, (int) (1)));
			}
		}, 10f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("infuseddiamondhoe"));
	}
}
