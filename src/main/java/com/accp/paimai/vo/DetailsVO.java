package com.accp.paimai.vo;

import java.util.Date;
import java.util.List;

import com.accp.paimai.pojo.Detail;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;

public class DetailsVO {
    private Integer goodsid;

    private String goodsname;

    private Float goodsprice;

    @JsonFormat(pattern = "yy-MM-dd")
    private Date startdate;

    @JsonFormat(pattern = "yy-MM-dd")
    private Date enddate;

    private Integer statrc;

    private String depict;

    private String goodsimg;
    
    private List<Detail> details;

}
