package com.zhj.cau.commonandroidutil.bean;

import java.util.List;

public class AdBean {

        /**
         * imgUrl : https://img.qiuyoule.com/start/20180503/1525339375301.png
         * adverts : [{"targetUrl":"htttps://www.baidu.com/","advertPic":"https://img.qiuyoule.com/start/20180503/1525339375301.png"}]
         */

        private String imgUrl;
        private List<AdvertsBean> adverts;

        public String getImgUrl() {
            return imgUrl;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public List<AdvertsBean> getAdverts() {
            return adverts;
        }

        public void setAdverts(List<AdvertsBean> adverts) {
            this.adverts = adverts;
        }

        public static class AdvertsBean {
            /**
             * targetUrl : htttps://www.baidu.com/
             * advertPic : https://img.qiuyoule.com/start/20180503/1525339375301.png
             */
            private int interactFlg;
            private int advertId;
            private String targetUrl;
            private String advertPic;

            public int getAdvertId() {
                return advertId;
            }

            public void setAdvertId(int advertId) {
                this.advertId = advertId;
            }

            public int getInteractFlg() {
                return interactFlg;
            }

            public void setInteractFlg(int interactFlg) {
                this.interactFlg = interactFlg;
            }

            public String getTargetUrl() {
                return targetUrl;
            }

            public void setTargetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
            }

            public String getAdvertPic() {
                return advertPic;
            }

            public void setAdvertPic(String advertPic) {
                this.advertPic = advertPic;
            }
        }
}
