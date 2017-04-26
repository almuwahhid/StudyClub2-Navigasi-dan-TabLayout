package studygroup.hmjti.com.layoutfragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Home extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View tampilan = inflater.inflate(R.layout.activity_home, null);
        return  tampilan;
    }
}
