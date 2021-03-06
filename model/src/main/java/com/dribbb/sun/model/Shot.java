package com.dribbb.sun.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

import java.util.List;

/**
 * Created by sunbinqiang on 16/2/2.
 */
public class Shot implements Parcelable {

    /**
     * id : 2485306
     * title : Nithsdale Distillery
     * description :
     * width : 400
     * height : 300
     * images : {"hidpi":"https://d13yacurqjgara.cloudfront.net/users/13307/screenshots/2485306/whisky_logotype_design.jpg","normal":"https://d13yacurqjgara.cloudfront.net/users/13307/screenshots/2485306/whisky_logotype_design_1x.jpg","teaser":"https://d13yacurqjgara.cloudfront.net/users/13307/screenshots/2485306/whisky_logotype_design_teaser.jpg"}
     * views_count : 8471
     * likes_count : 801
     * comments_count : 47
     * attachments_count : 1
     * rebounds_count : 0
     * buckets_count : 46
     * created_at : 2016-01-27T12:28:59Z
     * updated_at : 2016-01-27T12:31:44Z
     * html_url : https://dribbble.com/shots/2485306-Nithsdale-Distillery
     * attachments_url : https://api.dribbble.com/v1/shots/2485306/attachments
     * buckets_url : https://api.dribbble.com/v1/shots/2485306/buckets
     * comments_url : https://api.dribbble.com/v1/shots/2485306/comments
     * likes_url : https://api.dribbble.com/v1/shots/2485306/likes
     * projects_url : https://api.dribbble.com/v1/shots/2485306/projects
     * rebounds_url : https://api.dribbble.com/v1/shots/2485306/rebounds
     * animated : false
     * tags : ["badge","bottle","design","lettering","logo","packaging","paper","sketch","whisky"]
     * user : {"id":13307,"name":"Mike | Creative Mints","username":"creativemints","html_url":"https://dribbble.com/creativemints","avatar_url":"https://d13yacurqjgara.cloudfront.net/users/13307/avatars/normal/Mike3.jpg?1382537343","bio":"Hi! My name is Mike, I&#39;m a creative geek from Prague. I enjoy creating eye candy solutions for web and mobile apps. Contact me at mike@creativemints.com","location":"Prague, Czech Republic","links":{"web":"http://www.creativemints.com/","twitter":"https://twitter.com/creativemints"},"buckets_count":0,"comments_received_count":10440,"followers_count":71737,"followings_count":340,"likes_count":239,"likes_received_count":221245,"projects_count":4,"rebounds_received_count":70,"shots_count":280,"teams_count":0,"can_upload_shot":true,"type":"Player","pro":true,"buckets_url":"https://api.dribbble.com/v1/users/13307/buckets","followers_url":"https://api.dribbble.com/v1/users/13307/followers","following_url":"https://api.dribbble.com/v1/users/13307/following","likes_url":"https://api.dribbble.com/v1/users/13307/likes","projects_url":"https://api.dribbble.com/v1/users/13307/projects","shots_url":"https://api.dribbble.com/v1/users/13307/shots","teams_url":"https://api.dribbble.com/v1/users/13307/teams","created_at":"2011-01-24T15:08:56Z","updated_at":"2016-01-27T12:31:45Z"}
     * team : null
     */

    private int id;
    private String title;
    private String description;
    private int width;
    private int height;
    /**
     * hidpi : https://d13yacurqjgara.cloudfront.net/users/13307/screenshots/2485306/whisky_logotype_design.jpg
     * normal : https://d13yacurqjgara.cloudfront.net/users/13307/screenshots/2485306/whisky_logotype_design_1x.jpg
     * teaser : https://d13yacurqjgara.cloudfront.net/users/13307/screenshots/2485306/whisky_logotype_design_teaser.jpg
     */

    private ImageEntity images;
    private int views_count;
    private int likes_count;
    private int comments_count;
    private int attachments_count;
    private int rebounds_count;
    private int buckets_count;
    private String created_at;
    private String updated_at;
    private String html_url;
    private String attachments_url;
    private String buckets_url;
    private String comments_url;
    private String likes_url;
    private String projects_url;
    private String rebounds_url;
    private boolean animated;
    /**
     * id : 13307
     * name : Mike | Creative Mints
     * username : creativemints
     * html_url : https://dribbble.com/creativemints
     * avatar_url : https://d13yacurqjgara.cloudfront.net/users/13307/avatars/normal/Mike3.jpg?1382537343
     * bio : Hi! My name is Mike, I&#39;m a creative geek from Prague. I enjoy creating eye candy solutions for web and mobile apps. Contact me at mike@creativemints.com
     * location : Prague, Czech Republic
     * links : {"web":"http://www.creativemints.com/","twitter":"https://twitter.com/creativemints"}
     * buckets_count : 0
     * comments_received_count : 10440
     * followers_count : 71737
     * followings_count : 340
     * likes_count : 239
     * likes_received_count : 221245
     * projects_count : 4
     * rebounds_received_count : 70
     * shots_count : 280
     * teams_count : 0
     * can_upload_shot : true
     * type : Player
     * pro : true
     * buckets_url : https://api.dribbble.com/v1/users/13307/buckets
     * followers_url : https://api.dribbble.com/v1/users/13307/followers
     * following_url : https://api.dribbble.com/v1/users/13307/following
     * likes_url : https://api.dribbble.com/v1/users/13307/likes
     * projects_url : https://api.dribbble.com/v1/users/13307/projects
     * shots_url : https://api.dribbble.com/v1/users/13307/shots
     * teams_url : https://api.dribbble.com/v1/users/13307/teams
     * created_at : 2011-01-24T15:08:56Z
     * updated_at : 2016-01-27T12:31:45Z
     */

    private User user;
    private Object team;
    private List<String> tags;


    private static final SingleClassLoader IMAGEENTITY_CL = new SingleClassLoader(
            ImageEntity.class);
    private static final SingleClassLoader USER_CL = new SingleClassLoader(
            User.class);

    protected Shot(Parcel in) {
        id = in.readInt();
        title = in.readString();
        description = in.readString();
        width = in.readInt();
        height = in.readInt();
        views_count = in.readInt();
        likes_count = in.readInt();
        comments_count = in.readInt();
        attachments_count = in.readInt();
        rebounds_count = in.readInt();
        buckets_count = in.readInt();
        created_at = in.readString();
        updated_at = in.readString();
        html_url = in.readString();
        attachments_url = in.readString();
        buckets_url = in.readString();
        comments_url = in.readString();
        likes_url = in.readString();
        projects_url = in.readString();
        rebounds_url = in.readString();
        animated = in.readByte() != 0;
        tags = in.createStringArrayList();
        images = in.readParcelable(IMAGEENTITY_CL);
        user = in.readParcelable(USER_CL);
    }

    public static final Creator<Shot> CREATOR = new Creator<Shot>() {
        @Override
        public Shot createFromParcel(Parcel in) {
            return new Shot(in);
        }

        @Override
        public Shot[] newArray(int size) {
            return new Shot[size];
        }
    };

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public ImageEntity getImages() {
        return images;
    }

    public String getHdipImage(){
        if(images != null){
            return TextUtils.isEmpty(images.getHidpi()) ? images.getNormal() : images.getHidpi();
        }
        return "";
    }

    public String getLdipImage(){
        if(images != null){
            return TextUtils.isEmpty(images.getTeaser()) ? images.getNormal() : images.getTeaser();
        }
        return "";
    }

    public String getNormImage(){
        if(images != null){
            return images.getNormal();
        }
        return "";
    }

    public int getViews_count() {
        return views_count;
    }

    public int getLikes_count() {
        return likes_count;
    }

    public int getComments_count() {
        return comments_count;
    }

    public int getAttachments_count() {
        return attachments_count;
    }

    public int getRebounds_count() {
        return rebounds_count;
    }

    public int getBuckets_count() {
        return buckets_count;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getHtml_url() {
        return html_url;
    }

    public String getAttachments_url() {
        return attachments_url;
    }

    public String getBuckets_url() {
        return buckets_url;
    }

    public String getComments_url() {
        return comments_url;
    }

    public String getLikes_url() {
        return likes_url;
    }

    public String getProjects_url() {
        return projects_url;
    }

    public String getRebounds_url() {
        return rebounds_url;
    }

    public boolean isAnimated() {
        return animated;
    }

    public User getUser() {
        return user;
    }

    public Object getTeam() {
        return team;
    }

    public List<String> getTags() {
        return tags;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(title);
        dest.writeString(description);
        dest.writeInt(width);
        dest.writeInt(height);
        dest.writeInt(views_count);
        dest.writeInt(likes_count);
        dest.writeInt(comments_count);
        dest.writeInt(attachments_count);
        dest.writeInt(rebounds_count);
        dest.writeInt(buckets_count);
        dest.writeString(created_at);
        dest.writeString(updated_at);
        dest.writeString(html_url);
        dest.writeString(attachments_url);
        dest.writeString(buckets_url);
        dest.writeString(comments_url);
        dest.writeString(likes_url);
        dest.writeString(projects_url);
        dest.writeString(rebounds_url);
        dest.writeByte((byte) (animated ? 1 : 0));
        dest.writeStringList(tags);
        dest.writeParcelable(images, flags);
        dest.writeParcelable(user, flags);
    }
}
