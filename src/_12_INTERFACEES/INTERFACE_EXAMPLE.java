package _12_INTERFACEES;

class phone
{
    public void call(){ System.out.println("the call is going"); }
    public void sms(){System.out.println("the sms is going");}

}

interface icamera {
    void photo();

    void video();
}

interface imusicplayer{
    void playmusic();
}

// one class can extends only one class but it can implement more than one interface
class smartphone extends phone implements icamera,imusicplayer{
    @Override
    public void photo() {
        System.out.println("it can take photo");
    }

    @Override
    public void playmusic() {
        System.out.println("it can play music");
    }

    @Override
    public void video() {
        System.out.println("it can take the video");
    }

}
public class INTERFACE_EXAMPLE {

    public static void main(String[] args) {
        smartphone s = new smartphone();
        s.photo();s.playmusic();
        s.video();s.sms();s.call();
        // now if the refernce if of class camera
        icamera c = new smartphone();
        c.photo();
        c.video();
        // this is same as the
        imusicplayer i = s;
        i.playmusic();
    }
}
