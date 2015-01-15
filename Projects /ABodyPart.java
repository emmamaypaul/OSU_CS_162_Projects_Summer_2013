package model.bodyPart;

import java.awt.*;

/**
 */
public abstract class ABodyPart implements INEBody {
    private ABodyState _bodyState = InvisibleState.Singleton;
    private IBody _rest;

    public ABodyPart(IBody r) {
        _rest = r;
    }

     /**
     * Executes a visitor design pattern algorithm which depends on the state
     * of the body part.
     * @param algo The algorithm to be executed
     * @param inp An arbitratry input parameter for the algorithm
     * @return The return value of the algorithm.
     */
    public Object execute(IBodyAlgo algo, Object inp) {
        return _bodyState.execute(this, algo, inp);
    }

    /**
     * Toggles (visible -> invisible or invisible -> visible)  the state of
     * the body part.
     */
    public void toggleState() {
        _bodyState.toggleState(this);
    }

    /**
     * @param s
     */
    void setBodyState(ABodyState s) {
        _bodyState = s;
    }

    public IBody getRest() {
        return _rest;
    }
}
