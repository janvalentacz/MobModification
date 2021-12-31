package cz.valentak.mobmodification;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

public class Listeners implements Listener {

    @EventHandler
    public void event(CreatureSpawnEvent event) {

        if(event.getEntityType() == EntityType.CREEPER) {
            Creeper creeper = (Creeper) event.getEntity();
            creeper.setPowered(true);
            //ITEMY CANNOT BE ADDED TO THIS MOB (CREEPER).
        }

        if(event.getEntityType() == EntityType.ZOMBIE) {
            Zombie zombie = (Zombie) event.getEntity();
            //ADDING ITEMS FOR ZOMBIE
            zombie.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
            zombie.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
            zombie.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
            zombie.getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
            //ADDING ITEM (SWORD) FOR ZOMBIE
            ItemStack strenghtSword = new ItemStack(Material.DIAMOND_SWORD);
            strenghtSword.addEnchantment(Enchantment.FIRE_ASPECT, 2);
            zombie.getEquipment().setItemInMainHand(strenghtSword);
        }

        if(event.getEntityType() == EntityType.SKELETON) {
            Skeleton skeleton = (Skeleton) event.getEntity();
            //ADDING ITEMS FOR SKELETON
            skeleton.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
            skeleton.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
            skeleton.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
            skeleton.getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
            //ADDING ITEM (BOW) FOR SKELETON
            ItemStack punchBow = new ItemStack(Material.BOW);
            punchBow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
            skeleton.getEquipment().setItemInMainHand(punchBow);
        }
    }
}
