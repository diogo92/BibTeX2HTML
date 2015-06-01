<#list BookletList as BookletData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${BookletData.citationKey}</li>
			<#if BookletData.author??>
				<li><strong>Author:</strong> ${BookletData.author}</li>
			</#if>
			<li><strong>Title:</strong> ${BookletData.title}</li>
			<#if BookletData.howpublished??>
				<li><strong>How Published:</strong> ${BookletData.howpublished}</li>
			</#if>
			<#if BookletData.year??>
				<li><strong>Year:</strong> ${BookletData.year}</li>
			</#if>
			<#if BookletData.address??>
				<li><strong>Address:</strong> ${BookletData.address}</li>
			</#if>
			<#if BookletData.month??>
				<li><strong>Month:</strong> ${BookletData.month}</li>
			</#if>
			<#if BookletData.note??>
				<li><strong>Note:</strong> ${BookletData.note}</li>
			</#if>
			<#if BookletData.key??>
				<li><strong>Key:</strong> ${BookletData.key}</li>
			</#if>
			<#if BookletData.crossref??>
				<li><strong>Crossref:</strong> ${BookletData.crossref}</li>
			</#if>
		</ul>
	</div>
</#list>