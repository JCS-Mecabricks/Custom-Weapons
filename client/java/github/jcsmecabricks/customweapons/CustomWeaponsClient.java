package github.jcsmecabricks.customweapons;

import github.jcsmecabricks.customweapons.util.ModModelPredicates;
import net.fabricmc.api.ClientModInitializer;

public class CustomWeaponsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ModModelPredicates.registerModelPredicates();
	}
}