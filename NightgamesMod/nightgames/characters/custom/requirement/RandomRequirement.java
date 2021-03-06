package nightgames.characters.custom.requirement;

import nightgames.characters.Character;
import nightgames.combat.Combat;
import nightgames.global.Global;

public class RandomRequirement implements CustomRequirement {
    float thresh;

    public RandomRequirement(float thresh) {
        this.thresh = thresh;
    }

    @Override
    public boolean meets(Combat c, Character self, Character other) {
        return Global.randomfloat() < thresh;
    }
}
