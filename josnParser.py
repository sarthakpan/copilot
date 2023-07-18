json = {
    "medications":[{
            "aceInhibitors":[{
                "name":"lisinopril",
                "strength":"10 mg Tab",
                "dose":"1 tab",
                "route":"PO",
                "sig":"daily",
                "pillCount":"#90",
                "refills":"Refill 3"
            }],
            "antianginal":[{
                "name":"nitroglycerin",
                "strength":"0.4 mg Sublingual Tab",
                "dose":"1 tab",
                "route":"SL",
                "sig":"q15min PRN",
                "pillCount":"#30",
                "refills":"Refill 1"
            }],
            "anticoagulants":[{
                "name":"warfarin sodium",
                "strength":"3 mg Tab",
                "dose":"1 tab",
                "route":"PO",
                "sig":"daily",
                "pillCount":"#90",
                "refills":"Refill 3"
            }],
            "betaBlocker":[{
                "name":"metoprolol tartrate",
                "strength":"25 mg Tab",
                "dose":"1 tab",
                "route":"PO",
                "sig":"daily",
                "pillCount":"#90",
                "refills":"Refill 3"
            }],
            "diuretic":[{
                "name":"furosemide",
                "strength":"40 mg Tab",
                "dose":"1 tab",
                "route":"PO",
                "sig":"daily",
                "pillCount":"#90",
                "refills":"Refill 3"
            }],
            "mineral":[{
                "name":"potassium chloride ER",
                "strength":"10 mEq Tab",
                "dose":"1 tab",
                "route":"PO",
                "sig":"daily",
                "pillCount":"#90",
                "refills":"Refill 3"
            }]
        }
    ],
    "labs":[{
        "name":"Arterial Blood Gas",
        "time":"Today",
        "location":"Main Hospital Lab"
        },
        {
        "name":"BMP",
        "time":"Today",
        "location":"Primary Care Clinic"
        },
        {
        "name":"BNP",
        "time":"3 Weeks",
        "location":"Primary Care Clinic"
        },
        {
        "name":"BUN",
        "time":"1 Year",
        "location":"Primary Care Clinic"
        },
        {
        "name":"Cardiac Enzymes",
        "time":"Today",
        "location":"Primary Care Clinic"
        },
        {
        "name":"CBC",
        "time":"1 Year",
        "location":"Primary Care Clinic"
        },
        {
        "name":"Creatinine",
        "time":"1 Year",
        "location":"Main Hospital Lab"
        },
        {
        "name":"Electrolyte Panel",
        "time":"1 Year",
        "location":"Primary Care Clinic"
        },
        {
        "name":"Glucose",
        "time":"1 Year",
        "location":"Main Hospital Lab"
        },
        {
        "name":"PT/INR",
        "time":"3 Weeks",
        "location":"Primary Care Clinic"
        },
        {
        "name":"PTT",
        "time":"3 Weeks",
        "location":"Coumadin Clinic"
        },
        {
        "name":"TSH",
        "time":"1 Year",
        "location":"Primary Care Clinic"
        }
    ],
    "imaging":[{
        "name":"Chest X-Ray 1",
        "time":"Today",
        "location":"Main Hospital Radiology"
        },
        {
        "name":"Chest X-Ray 2",
        "time":"Today",
        "location":"Main Hospital Radiology"
        },
        {
        "name":"Chest X-Ray 3",
        "time":"Today",
        "location":"Main Hospital Radiology"
        }
    ]
}

# generate function to format the json variable as {"medications":["lisinopril","nitroglycerin","warfarin sodium","metoprolol tartrate","furosemide","potassium chloride ER"]}
def formatMedications():
    medications = json["medications"]
    medicationList = []
    for medication in medications:
        for key in medication:
            medicationList.append(medication[key][0]["name"])
    return medicationList

# print result from formatMedications()
print(formatMedications())

# generate function to format json variable as {"labs":["Arterial Blood Gas","BMP","BNP","BUN","Cardiac Enzymes","CBC","Creatinine","Electrolyte Panel","Glucose","PT/INR","PTT","TSH"]}
def formatLabs():
    labs = json["labs"]
    labList = []
    for lab in labs:
        labList.append(lab["name"])
    return labList

# print result from formatLabs()
print(formatLabs())
