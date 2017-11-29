REGISTER /home/cloudera/state.jar;
REGISTER /home/cloudera/Downloads/piggybank-0.15.0.jar;

DEFINE XPath org.apache.pig.piggybank.evaluation.xml.XPath();

Data =  LOAD '/home/cloudera/StateDevelopment/StatewiseDistrictwisePhysicalProgress.xml.COMPLETED' using org.apache.pig.piggybank.storage.XMLLoader('row') as (x:chararray);
StateDet = FOREACH Data GENERATE XPath(x, 'row/State_Name') AS statename, XPath(x, 'row/District_Name') AS disname,XPath(x, 'row/Project_Objectives_IHHL_BPL') AS BPL,XPath(x, 'row/Project_Objectives_IHHL_TOTAL') AS total ;
FilteredData = FILTER StateDet BY CalcPC(BPL,total);
STORE FilteredData INTO '/home/cloudera/statepc' USING PigStorage(','); 
