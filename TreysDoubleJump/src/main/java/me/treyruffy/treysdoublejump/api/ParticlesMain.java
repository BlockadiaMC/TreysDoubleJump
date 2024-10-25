package me.treyruffy.treysdoublejump.api;

import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;

/**
 * Created by TreyRuffy on 08/12/2018.
 */

public class ParticlesMain {

	public void sendParticle(Player player, Particle particle, Location location, int amount, int r, int g, int b) {
		player.spawnParticle(particle, location, amount, new Particle.DustOptions(Color.fromRGB(r, g, b), 1.0f));
	}
}