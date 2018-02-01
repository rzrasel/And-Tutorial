package me.apphive.anondoutshob;

import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Rz Rasel on 2018-01-30.
 */

public class ServiceIME extends InputMethodService implements KeyboardView.OnKeyboardActionListener {
    private KeyboardView kv;
    private Keyboard keyboard;

    private boolean caps = false;
    //private List<Integer> vowelList = Arrays.asList(new Integer[]{2437, 2438, 2439, 111, 117,});
    private List<Integer> vowelList = new ArrayList<Integer>();
    private HashMap<Integer, Integer> vowelForm = new HashMap<>();
    private int previousKey = 0;

    @Override
    public void onCreate() {
        super.onCreate();
        vowelList.add(2437); //a
        vowelList.add(2438); //aa
        vowelList.add(2447); //e
        vowelList.add(2439); //i
        vowelForm.put(2437, 2494); //a
        vowelForm.put(2438, 2494); //aa
        vowelForm.put(2447, 2503); //e
        vowelForm.put(2439, 2495); //i
    }

    @Override
    public View onCreateInputView() {
        kv = (KeyboardView) getLayoutInflater().inflate(R.layout.keyboard, null);
        keyboard = new Keyboard(this, R.xml.qwerty);
        kv.setKeyboard(keyboard);
        kv.setOnKeyboardActionListener(this);
        return kv;
    }

    private void playClick(int keyCode) {
        AudioManager am = (AudioManager) getSystemService(AUDIO_SERVICE);
        switch (keyCode) {
            case 32:
                am.playSoundEffect(AudioManager.FX_KEYPRESS_SPACEBAR);
                break;
            case Keyboard.KEYCODE_DONE:
            case 10:
                am.playSoundEffect(AudioManager.FX_KEYPRESS_RETURN);
                break;
            case Keyboard.KEYCODE_DELETE:
                am.playSoundEffect(AudioManager.FX_KEYPRESS_DELETE);
                break;
            default:
                am.playSoundEffect(AudioManager.FX_KEYPRESS_STANDARD);
        }
    }

    @Override
    public void onKey(int primaryCode, int[] keyCodes) {
        InputConnection inputConnection = getCurrentInputConnection();
        StringBuilder stringBuilder = new StringBuilder();
        playClick(primaryCode);
        switch (primaryCode) {
            case Keyboard.KEYCODE_DELETE:
                inputConnection.deleteSurroundingText(1, 0);
                previousKey = 0;
                break;
            case Keyboard.KEYCODE_SHIFT:
                caps = !caps;
                keyboard.setShifted(caps);
                kv.invalidateAllKeys();
                previousKey = 0;
                break;
            case Keyboard.KEYCODE_DONE:
                inputConnection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_ENTER));
                previousKey = 0;
                break;
            default:
                char code = (char) primaryCode;
                if (primaryCode == 32) {
                    inputConnection.commitText(String.valueOf(code), 1);
                    previousKey = 0;
                    return;
                }
                if (Character.isLetter(code) && caps) {
                    code = Character.toUpperCase(code);
                }
                if (previousKey != 0) {
                    //stringBuilder = new StringBuilder();
                    if (vowelList.contains(previousKey)) {
                        if (primaryCode == 2437 && previousKey == 2437) {
                            code = (char) 2494;
                            inputConnection.commitText(String.valueOf(code), 1);
                            previousKey = 0;
                        } else if (primaryCode == 2439 && previousKey == 2439) {
                            inputConnection.deleteSurroundingText(1, 0);
                            code = (char) 2440;
                            inputConnection.commitText(String.valueOf(code), 1);
                            previousKey = 0;
                        } else {
                            inputConnection.commitText(String.valueOf(code), 1);
                            previousKey = 0;
                        }
                    } else {
                        inputConnection.deleteSurroundingText(1, 0);
                        stringBuilder = new StringBuilder();
                        stringBuilder.append((char) previousKey);
                        if (vowelList.contains(primaryCode)) {
                            if (vowelForm.containsKey(primaryCode)) {
                                int formVal = (int) vowelForm.get(primaryCode);
                                code = (char) formVal;
                            }
                            previousKey = 0;
                        } else {
                            stringBuilder.append((char) 2509);
                            previousKey = primaryCode;
                        }
                        stringBuilder.append(String.valueOf(code));
                        inputConnection.commitText(stringBuilder, 1);
                        //previousKey = 0;
                    }
                } else {
                    //inputConnection.commitText(vowelForm.size() + "", 1);
                    inputConnection.commitText(String.valueOf(code), 1);
                    previousKey = primaryCode;
                }
                /*stringBuilder = new StringBuilder();
                stringBuilder.append(" ");
                stringBuilder.append((char) 2480);
                stringBuilder.append((char) 2509);
                stringBuilder.append((char) 2453);
                stringBuilder.append((char) 8203);
                inputConnection.commitText(stringBuilder, 1);*/
                /*if (vowelList.contains(primaryCode)) {
                    if (previousKey != 0) {
                        inputConnection.deleteSurroundingText(1, 0);
                        stringBuilder = new StringBuilder();
                        //stringBuilder.append(String.valueOf((char) previousKey));
                        //inputConnection.commitText(" " + previousKey + " ", 1);
                        stringBuilder.append((char) previousKey);
                        stringBuilder.append((char) 2509);
                        if (vowelForm.containsKey(primaryCode)) {
                            int formVal = (int) vowelForm.get(primaryCode);
                            code = (char) formVal;
                        }
                        stringBuilder.append(code);
                        *//*stringBuilder.append((char) 2509);
                        stringBuilder.append((char) 2494);*//*
                        inputConnection.commitText(stringBuilder, 1);
                        previousKey = 0;
                    } else {
                        inputConnection.commitText(String.valueOf(code), 1);
                        previousKey = primaryCode;
                    }
                } else {
                    if (previousKey != 0) {
                        inputConnection.deleteSurroundingText(1, 0);
                        stringBuilder = new StringBuilder();
                        //stringBuilder.append(String.valueOf((char) previousKey));
                        //inputConnection.commitText(" " + previousKey + " ", 1);
                        stringBuilder.append((char) previousKey);
                        stringBuilder.append((char) 2509);
                        stringBuilder.append(code);
                        *//*stringBuilder.append((char) 2509);
                        stringBuilder.append((char) 2494);*//*
                        inputConnection.commitText(stringBuilder, 1);
                        previousKey = 0;
                    } else {
                        inputConnection.commitText(String.valueOf(code), 1);
                        previousKey = primaryCode;
                    }
                }*/
                //previousKey = primaryCode;
                /*if (previousKey != 0) {
                    if (vowelList.contains(primaryCode)) {
                        inputConnection.commitText(String.valueOf(code), 1);
                        previousKey = primaryCode;
                    } else {
                        inputConnection.deleteSurroundingText(1, 0);
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(String.valueOf(previousKey));
                        stringBuilder.append(String.valueOf((char) 2509));
                        stringBuilder.append(String.valueOf(code));
                        inputConnection.commitText(stringBuilder, 1);
                        previousKey = 0;
                    }
                } else {
                    previousKey = primaryCode;
                    inputConnection.commitText(String.valueOf(code), 1);
                }*/
        }
    }

    /*@Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //InputConnection inputConnection = getCurrentInputConnection();
        //inputConnection.commitText(" key_down ", 1);
        //onKey(65, null);
        return super.onKeyDown(keyCode, event);
    }*/

    @Override
    public void onPress(int primaryCode) {
    }

    @Override
    public void onRelease(int primaryCode) {
    }

    @Override
    public void onText(CharSequence text) {
    }

    @Override
    public void swipeDown() {
    }

    @Override
    public void swipeLeft() {
    }

    @Override
    public void swipeRight() {
    }

    @Override
    public void swipeUp() {
    }
}
