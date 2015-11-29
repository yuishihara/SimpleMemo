package jp.techblog.epsiloncode.simplememo;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by yuishihara on 15/11/23.
 */
public class MemoListAdapter extends RecyclerView.Adapter<MemoListAdapter.MemoViewHolder> {
    private List<String> mTitleList;

    public static class MemoViewHolder extends RecyclerView.ViewHolder {
        public TextView mTitle;
        public ImageView mDeleteButton;

        public MemoViewHolder(LinearLayout layout) {
            super(layout);
            mTitle = (TextView) layout.findViewById(R.id.memo_title);
            mDeleteButton = (ImageView) layout.findViewById(R.id.delete_button);
        }
    }

    public MemoListAdapter(List<String> titleList) {
        mTitleList = titleList;
    }

    @Override
    public MemoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LinearLayout layout =
                (LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.drawer_item, parent, false);
        return new MemoViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(MemoViewHolder holder, int position) {
        holder.mTitle.setText(mTitleList.get(position));
    }

    @Override
    public int getItemCount() {
        return mTitleList.size();
    }
}
