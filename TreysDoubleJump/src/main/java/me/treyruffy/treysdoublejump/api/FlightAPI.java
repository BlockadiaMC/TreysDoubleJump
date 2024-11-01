package me.treyruffy.treysdoublejump.api;

import com.moneybags.tempfly.TempFly;
import com.moneybags.tempfly.TempFlyAPI;
import me.treyruffy.treysdoublejump.events.FlightListener;
import org.bukkit.entity.Player;

/* Created by TreyRuffy on 08/12/2018. */

/** The Flight api */
public class FlightAPI {

  /**
   * Is flight enabled for the player.
   *
   * @param player the player
   * @return flight enabled for the player
   */
  public static Boolean isFlightEnabled(Player player) {
		return TempFly.getAPI().getUser(player).hasFlightEnabled();
	}
}
