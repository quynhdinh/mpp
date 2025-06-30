# Lab 6
**14.14**

Here are some functional dependencies

a) Patient No → Full Name

Ward No → Ward Name

Drug No → Name, Description, Dosage, Method of Admin

Patient No, Drug No, Start Date → Units per Day, Finish date

(b) Describe and illustrate the process of normalizing the data in 3NFs

**First Normal Form**

<ins>Patient No, Drug No, Start Date,</ins> Full Name, Ward No, Ward Name, Bed No, Name,
Description, Dosage, Method of Admin, Units per Day, Finish Date

**Second Normal Form**

<ins>Patient No, Drug No, Start Date,</ins> Ward No, Ward Name, Bed No, Units per Day, Finish
Date

<ins>Drug No,Patient No,</ins> Full Name

**Third Normal Form**

<ins>Patient No, Drug No, Start Date,</ins> Ward No, Bed No, Units per Day, Finish Date

<ins>Drug No,</ins> Name, Description, Dosage, Method of Admin

<ins>Patient No,</ins> Full Name

<ins>Ward No,</ins> Ward Name

(c) Identify the primary, alternate, and foreign keys in your BCNF relations.

<ins>Patient No(FK), Drug No(FK), Start Date</ins> Ward No(FK), Bed No, Units per Day, Finish Date

<ins>Drug No,</ins> Name, Description, Dosage, Method of Admin

<ins>Patient No,</ins> Full Name

<ins>Ward No,</ins> Ward Name

Primary keys underlined.

**14.15**

a. There are anomalies updating this table, for example, if we want to change the dentist's name for a specific surgery number, we would have to update multiple rows. This can lead to inconsistencies if one row is updated and another is not.


b. Identify the functional dependencies represented by the attributes shown in the table of Figure 14.19. State
any assumptions you make about the data and the attributes shown in this table.
**Functional Dependencies**
**Assumptions:**
- Each appointment is uniquely identified by the combination of surgery number and appointment date/time.
- Each dentist is uniquely identified by their staff number.
- Each patient is uniquely identified by their patient number.
- Each appointment is associated with one dentist and one patient.
- Each dentist can have multiple appointments, but each appointment is associated with only one dentist.
- Each patient can have multiple appointments, but each appointment is associated with only one patient.

**Functional Dependencies:**
- staffNo -> dentistName
- patNo -> patName
- staffNo -> dentistName
- surgeryNo -> appointmentDateTime
- surgeryNo -> staffNo
- surgeryNo -> patNo
- surgeryNo -> patName
- surgeryNo -> dentistName

c. The table first of all violates 1NF because it contains multiple values in a single cell (e.g., multiple appointment times for a single appointment).

### 1NF

**Appointment**(staffNo(PK), dentistName, patNo(PK), patName, appointmentDate(PK), appointmentTime(PK), surgeryNo)

### 2NF

In 2NF, we need to remove partial dependencies. This means that all non-key attributes must depend on the entire primary key, not just part of it. In our case, we can separate the staff and patient information into their own tables, as they do not depend on the appointment time.

**Staff**(staffNo(PK), dentistName)

**Patient**(patNo(PK), patName)

**Appointment**(surgeryNo(PK), staffNo(FK), patNo(FK), appointmentDate, appointmentTime)

### 3NF

**Staff**(staffNo(PK), dentistName)

**Patient**(patNo(PK), patName)

**Appointment**(surgeryNo(PK), staffNo(FK), patNo(FK), appointmentDate, appointmentTime)