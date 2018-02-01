package com.squareup.picasso;

public interface Callback {

    public class EmptyCallback implements Callback {
        public void onError() {
        }

        public void onSuccess() {
        }
    }

    void onError();

    void onSuccess();
}
