package com.hackathon.tetris.state;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

public abstract class State {
    protected OrthographicCamera cam;
    protected Vector2 mouse;
    protected GameStateManager gsm;

    protected State(GameStateManager gsm){
        this.gsm = gsm;
        cam = new OrthographicCamera();
        mouse = new Vector2();

    }

    protected abstract void handleInput();

    public abstract void upadte (float dt); // update scene
    public abstract void render(); // render scene
    public abstract void dispose(); // dispose resource
    public abstract void resize(int width, int height);

}
