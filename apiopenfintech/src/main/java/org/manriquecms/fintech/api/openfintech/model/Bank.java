package org.manriquecms.fintech.api.openfintech.model;


public class Bank {
    private String type;
    private String id;
    private BankAttributes attributes;


}

class BankAttributes{
    private String code;
    private String name;
    private String account_no;
    private String bank_code;
    private String bic;
    private String sort_code;
    private String vatin;
    private String status;
    private String created;
    private String updated;
}


//        "type": "banks",
//        "id": "bnk_NbXnxmLU8SmUd8bQ",
//        "attributes": {
//        "code": "5_ta_filiya_u_m_odesa",
//        "name": "П'ята філія Приватного акціонерного товариства \"Українська фінансова група\" у м.Одеса",
//        "account_no": null,
//        "bank_code": null,
//        "bic": null,
//        "iban": null,
//        "sort_code": "388636",
//        "vatin": null,
//        "status": "active",
//        "created": 1502551988,
//        "updated": 1502551988
//        },
//        "relationships": {
//        "organization": {
//        "links": {
//        "related": "/v1/banks/bnk_NbXnxmLU8SmUd8bQ/organization"
//        }
//        }
//        },
//        "links": {
//        "self": "/v1/banks/bnk_NbXnxmLU8SmUd8bQ"
//        }
//        },